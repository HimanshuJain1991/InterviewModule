package com.rays.ctl;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.rays.common.BaseCtl;
import com.rays.common.DropDownList;
import com.rays.common.ORSResponse;
import com.rays.common.attachment.AttachmentDTO;
import com.rays.common.attachment.AttachmentServiceInt;
import com.rays.dto.RoleDTO;
import com.rays.dto.UserDTO;
import com.rays.form.UserForm;
import com.rays.service.RoleServiceInt;
import com.rays.service.UserServiceInt;

@RestController
@RequestMapping(value = "User")
public class UserCtl extends BaseCtl<UserForm, UserDTO, UserServiceInt> {
	@Autowired
	public RoleServiceInt roleService;

	@PostMapping("save")
	public ORSResponse save(@RequestBody @Valid UserForm form, BindingResult bindingResult) {
		ORSResponse res = validate(bindingResult);
		if (!res.isSuccess()) {
			return res;
		}
		UserDTO dto = (UserDTO) form.getDto();
		if (dto.getId() != null && dto.getId() > 0) {
			baseService.update(dto);
			res.addMessage("Data Updated");
			res.addData(dto.getId());
		} else {
			Long id = baseService.add(dto);
			res.addMessage("Data save successfully....!!!!!!!");
			res.addData(id);
		}
		return res;
	}

	@GetMapping("get/{id}")
	public ORSResponse get(@PathVariable Long id) {
		UserDTO dto = baseService.findById(id);
		ORSResponse res = new ORSResponse(true);
		res.setSuccess(true);
		res.addData(dto);
		return res;
	}

	@GetMapping("delete/{id}")
	public ORSResponse delete(@PathVariable Long id) {
		baseService.delete(id);
		ORSResponse res=new ORSResponse(true);
		res.addMessage(id+" =id deleted successfully....!!!!!");
		return res;
	}
	
	@GetMapping("preload")
	public ORSResponse preload() {
		System.out.println("preload calling.......");
		RoleDTO dto = new RoleDTO();
		List<DropDownList>list= roleService.search(dto, 0, 0);
		ORSResponse res = new ORSResponse(true);
		res.addResulte("roleList", list);
		return res;
	}
	@Value("${page.size}")
	protected int pageSize;
	
	@RequestMapping(value="search/{pageNo}" ,method = {RequestMethod.POST, RequestMethod.GET})
	public ORSResponse search(@RequestBody UserForm form,@PathVariable int pageNo) {
		ORSResponse res=new ORSResponse(true);
		UserDTO dto=(UserDTO) form.getDto();
		List list=baseService.search(dto, pageNo, pageSize);
		if(list.size()==0 ) {
			res.addMessage("No Record Found.....!!!!!");
		}else {
		res.addData(list);
		}
		return res;
	}
	
	@Autowired
	public AttachmentServiceInt attacmentService;
	@PostMapping("profilePic/{userId}")
	public ORSResponse uploadPic(@PathVariable Long userId,@RequestParam("file") MultipartFile file) {
		System.out.println("profile Pic calling.......!!!!!!!!");
		UserDTO dto=baseService.findById(userId);
		AttachmentDTO doc=new AttachmentDTO(file);
		doc.setDescription("profilePic");
		doc.setUserId(userId);
		if(dto.getImageId()!=null && dto.getImageId()>0) {
			doc.setId(dto.getImageId());
			
		}
		Long imageId=attacmentService.save(doc);
		if(dto.getImageId()==null || dto.getImageId()==0) {
			dto.setImageId(imageId);
			baseService.update(dto);
		}
		ORSResponse res=new ORSResponse(true);
		res.setSuccess(true);
		res.addResulte("imageId", imageId);
		return res;
	}
	
	@GetMapping("profilePic/{userId}")
	public @ResponseBody void downloadPic(@PathVariable Long userId,HttpServletResponse response) throws IOException {
		UserDTO userDTO=baseService.findById(userId);
		AttachmentDTO doc=attacmentService.findById(userDTO.getImageId());
		if(doc!=null) {
		response.setContentType(doc.getType());
		OutputStream out=response.getOutputStream();
		out.write(doc.getDoc());
		out.close();
		}else {
			response.getWriter().write("ERROR:File Not found....");
		}
		
		
	}

}
