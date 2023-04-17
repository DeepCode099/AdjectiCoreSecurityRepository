package com.adjecti.security.core.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.security.core.model.Group;
import com.adjecti.security.core.service.GroupService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/group")
public class GroupController {

		private GroupService groupService;
		
		public GroupController(GroupService groupService) {
			super();
			this.groupService = groupService;
		}
		
		// build create Group REST API
       //  http://localhost:8080/api/v1/group
		@PostMapping()
		public ResponseEntity<Group> createGroup(@RequestBody Group group){
			return new ResponseEntity<Group>(groupService.createGroup(group), HttpStatus.CREATED);
		}
		
		// build get all groups REST API
		// http://localhost:8080/api/v1/group
		@GetMapping
		public List<Group> getAllGroups(){
			return groupService.getAllGroups();
		}
		
		// build get Group by id REST API
		// http://localhost:8080/api/v1/group/1
		@GetMapping("{id}")
		public ResponseEntity<Group> getGroupById(@PathVariable("id") long groupId){
			return new ResponseEntity<Group>(groupService.getGroupById(groupId), HttpStatus.OK);
		}
		
		// build update group REST API
		// http://localhost:8080/api/v1/group/1
		@PutMapping("{id}")
		public ResponseEntity<Group> updateGroup(@PathVariable("id") long id ,@RequestBody Group group){
			return new ResponseEntity<Group>(groupService.updateGroup(group, id), HttpStatus.OK);
		}
		
		// build delete role REST API
		// http://localhost:8080/api/roles/1
		@DeleteMapping("{id}")
		public ResponseEntity<String> deleteGroup(@PathVariable("id") long id){
			// delete Group from DB
			groupService.deleteGroup(id);
			return new ResponseEntity<String>("Group deleted successfully!.", HttpStatus.OK);
		}

	
	
}
