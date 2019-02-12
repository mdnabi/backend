package com.example;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.lti.scholarship.app.NationalScholarshipApplication;
import com.lti.scholarship.app.controller.InstituteService;
import com.lti.scholarship.app.controller.StudentLoginService;
import com.lti.scholarship.app.controller.StudentService;
import com.lti.scholarship.app.entity.Student;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NationalScholarshipApplication.class)
@Rollback(false)
public class NationalScholarshipApplicationTests {
	@Autowired
	StudentService studentService;

	@Autowired
	InstituteService instituteService;

	@Autowired
	StudentLoginService studentLoginService;

	//@Test
	//@Transactional
	//public void addStudent() {
	//Test case 1
	// Student student = new Student();
	
	// student.setAdharNo("szsasas"); student.setBankAccNo("asasaas");
	// studentService.add(student);
	 

	// Test case 2

	
	//student.setAdharNo("586786786785"); student.setStateOfDomicile("Bangalore");
	//student.setName("akhil"); student.setGender("Male");
	// student.setPassword("112233"); student.setMobileNo("8125507475");
	// student.setEmail("xyz@gmail.com"); student.setInstituteCode("AC505");
	// System.out.println("student test called"); 
	// studentService.add(student);
	 

	// Test case 3
	/*
	 * student.setAdharno("5458965475"); student.setStateofdomicile("Bangal");
	 * student.setName("Nabeel"); student.setGender("Male");
	 * student.setMobileno("7856325874"); student.setEmail("lntMail@gmail.com");
	 * student.setInstitutecode("AC505"); System.out.println("student test called");
	 * studentService.add(student);
	 */

	// Test case 4
	/*
	 * student.setAdharno("6458965475"); student.setStateofdomicile("andhra");
	 * student.setName("Najeeb"); student.setGender("Male");
	 * student.setMobileno("6856325874"); student.setEmail("najeeb@gmail.com");
	 * student.setInstitutecode("AC505"); System.out.println("student test called");
	 * studentService.add(student);
	 */

	// Test case 5
	/*
	 * student.setAdharno("3458965475"); student.setStateofdomicile("karnataka");
	 * student.setName("Naajar"); student.setGender("Male");
	 * student.setMobileno("5856325874"); student.setEmail("naajar@gmail.com");
	 * student.setInstitutecode("AC505"); System.out.println("student test called");
	 * studentService.add(student);
	 */

	// Test case 6
	/*
	 * student.setAdharno("1458965475"); student.setStateofdomicile("tamilnaadu");
	 * student.setName("srikanth"); student.setGender("Male");
	 * student.setMobileno("3856325874"); student.setEmail("sri@gmail.com");
	 * student.setInstitutecode("AC505"); System.out.println("student test called");
	 * studentService.add(student);
	 */
	/*
	 * student.setAdharNo("1458965475"); student.setStateOfDomicile("tamilnaadu");
	 * student.setName("srikanth"); student.setGender("Male");
	 * student.setMobileNo("3856325874"); student.setEmail("sri@gmail.com");
	 * student.setInstituteCode("AC505"); System.out.println("student test called");
	 * studentService.add(student);
	 */
//	 }

	// @Test
	// @Transactional
	// public void fetchById() {
	/*
	 * Student student = studentService.fetchById(21); //
	 * System.out.println(student.getAdharno()); // assertEquals("1458965475",
	 * student.getAdharNo()); assertEquals("sri@gmail.com", student.getEmail()); //
	 * assertEquals("AC505", student.getInstituteCode(); //
	 * assertEquals("1234567890", student.getMobileNo(); //
	 * assertEquals("Maharashtra", student.getStateOfDomicile(); //
	 * System.out.println(student.getEmail());
	 * 
	 * // Student student=studentService.fetchById(2); // assertEquals("4458965475",
	 * student.getAdharNo(); // assertEquals("xyz@gmail.com", student.getEmail());
	 * // assertEquals("AC505", student.getInstitutecode()); //
	 * assertEquals("9856325874", student.getMobileNo()); //
	 * assertEquals("Maharashtra", student.getStateOfDomicile());
	 * 
	 * // Student student=studentService.fetchById(4); // assertEquals("6458965475",
	 * student.getAdharNo(); // assertEquals("najeeb@gmail.com", student.getEmail();
	 * // assertEquals("AC505", student.getInstitutecode()); //
	 * assertEquals("6856325874", student.getMobileNo()); // assertEquals("andhra",
	 * student.getStateOfDomicile();
	 * 
	 * // Student student=studentService.fetchById(5); // assertEquals("3458965475",
	 * student.getAdharNo(); // assertEquals("naajar@gmail.com", student.getEmail();
	 * // assertEquals("AC505", student.getInstitutecode()); //
	 * assertEquals("5856325874", student.getMobileNo()); //
	 * assertEquals("karnataka", student.getStateOfDomicile());
	 */
	
	// }

	//@Test

	// @Transactional
	// public void addInstitute() {

	// Institute institute = new Institute();
	/*
	 * institute.setDiseCodeOfInstitute("1");
	 * institute.setInstituteEstCertificate("andhraprad");
	 * institute.setInstitutionCode("112"); institute.setInstitutionName("nimra ");
	 * institute.setState("andhr"); institute.setUniversityCertificate("sdfgd");
	 * institute.setUniversityName("jntuka");
	 * institute.setUniversityState("andhra");
	 * System.out.println(institute.getDiseCodeOfInstitute());
	 * instituteService.add(institute);
	 */

	/*
	 * institute.setDiseCodeOfInstitute("124");
	 * institute.setInstituteEstCertificate("up");
	 * institute.setInstitutionCode("1113");
	 * institute.setInstitutionName("nimra institute ");
	 * institute.setState("utharpradesh");
	 * institute.setUniversityCertificate("sdfgdsfs");
	 * institute.setUniversityName("jntum"); institute.setUniversityState("up");
	 * System.out.println(institute.getDiseCodeOfInstitute());
	 * instituteService.add(institute);
	 */

	/*
	 * institute.setDiseCodeOfInstitute("125");
	 * institute.setInstituteEstCertificate("andhra");
	 * institute.setInstitutionCode("114");
	 * institute.setInstitutionName("nimra engg "); institute.setState("andhra");
	 * institute.setUniversityCertificate("sdfgnjj");
	 * institute.setUniversityName("jntukh");
	 * institute.setUniversityState("andhraPradesh");
	 * System.out.println(institute.getDiseCodeOfInstitute());
	 * instituteService.add(institute);
	 */

	/*
	 * institute.setDiseCodeOfInstitute("126");
	 * institute.setInstituteEstCertificate("bihar");
	 * institute.setInstitutionCode("115");
	 * institute.setInstitutionName("shiksha abhiyan ");
	 * institute.setState("bihar"); institute.setUniversityCertificate("jj");
	 * institute.setUniversityName("jntub"); institute.setUniversityState("bihar");
	 * System.out.println(institute.getDiseCodeOfInstitute());
	 * instituteService.add(institute); System.out.println("OK");
	 */

	// }

	/*
	 * @Test
	 * 
	 * @Transactional public void fetchByinstituteId() { Institute institute
	 * =instituteService.fetchById(21);
	 * System.out.println(institute.getUniversityName()); assertEquals("AC505",
	 * institute.getInstitutionCode());
	 */
	/*
	 * Institute institute = instituteService.fetchById(51);
	 * System.out.println(institute.getUniversityName()); assertEquals("nimra engg",
	 * institute.getInstitutionName());
	 */
	/*
	 * Institute institute = instituteService.fetchById(50);
	 * System.out.println(institute.getUniversityName());
	 * assertEquals("jntum",institute.getUniversityName())
	 */;

	// }

	/*
	 * @Test
	 * @Transactional public void fetchStudentsByInstituteId() {
	 * studentService.fetchById(21); }
	 */

	/*
	 * @Test
	 * @Transactional public String fetchInstitutesByInstituteId() {
	 * instituteService.fetchById(22); return "Student fetch by id Done"; }
	 */

	/*
	 * @Transactional
	 * @Test public void fetchAllInstitutes() { instituteService.fetchAll();
	 * System.out.println("done"); }
	 */

	@Test
	@Transactional
	public void verify() {
		boolean valid = studentLoginService.verify("Nani", "pass");
	//boolean valid = studentLoginService.verify("Nani", "password");
		//boolean valid = studentLoginService.verify("Nani", "password");
	}

}
