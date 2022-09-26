# Khái niệm
1. Restful web service: 
	- Có 2 dạng: SOAP(XML) và REST(JSON)
	- JSON + Web service (REST API): đồng bộ hoá giữa web app và mobile app cho server

2. @RestController, @RequestMapping(value = '', method= RequestMethod.POST), @RequestBody và @RequestBody, @RequestController
	- Đặt ***@RestController*** để định nghĩa đó là lớp API, nếu không thì đó chỉ là class Java bình thường.
	- @RequestMapping có value là */new* sẽ đi vào, xét http method phải đúng với thao tác
	- @ResponseBody (*input từ client*) và @RequestBody(*parse json cho client*): dùng để trả và gửi dữ liệu lên server
	- @RequestController = @Controller + @RequestBody
	- @PostMapping(value='/new')  = @RequestMapping(value = '', method= RequestMethod.POST)
	
3. DTO (Data transfer object)
	- Kiểu dữ liệu để trả về cho end user
	
4. JDBC
	- Sử dụng các câu SQL thuần
	- PrepareStatement và Statement
	- Phụ thuộc nhiều database
	- Phải load driver
	- Sử dụng ScriptSQL để chạy
	
5. Data JPA: entity mapping table (Java Persistence API)
	- findAll()
	- @Entity
	- @Table
	- @Column
	- @Id: not null & primary key
	- JPA: ORM, tất cả đều được vô class (entity) = Hibernate
	- Spring data JPA: được phát triển dựa trên JPA

6. HQL: Hibernate query language được thiết kế riêng ra cho JPA
	
7. SQL native: chạy những câu query thuần

8. Relationship:
	- many to many (user và role):
		+ @ManyToMany: 
	- one to many (category và news):
		+ @OneToMany: 
	- many to one
		+ @ManyToOne: 

9. Install driver to connect database
	- create
	- none | create-drop
		+ none: không có thao tác bất kì gì về database.
		+ create-drop: drop trước và create sau dựa vào entity.
		
10. Pakages service, impl, repository, converter
	- server:
	- impl:
	- repository (dao): 
	- converter: @Component chuyển dữ liệu từ dto sang entity
	- 
	
11. @Autowired
	- Dependency injection
	
12. 
	- dto và entity: 
		+ DTO: xử lí logic trên giao diện, có nhiều field ở FE xử lí nên ta cần lớp DTO 
				để lưu dữ liệu và không ảnh hưởng entity

13.
	- <T>: Generic T Type
	
14. 
	- Overloadding: Cùng 1 tên function nhưng truyền nhiều tham số hơn

15.
	- jpaauditing: createdDate and modifiedDate
16. Pagination
	- Input: page, limit
	- Output: totalPage, page, list
		
	

	
	

	
	