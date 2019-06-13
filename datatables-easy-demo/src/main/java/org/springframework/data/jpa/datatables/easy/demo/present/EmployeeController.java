package org.springframework.data.jpa.datatables.easy.demo.present;

import java.util.Arrays;

import org.springframework.data.jpa.datatables.easy.demo.persistence.entities.Employee;
import org.springframework.data.jpa.datatables.easy.demo.persistence.enums.Position;
import org.springframework.data.jpa.datatables.easy.demo.persistence.repository.EmployeeDataTableRepository;
import org.springframework.data.jpa.datatables.easy.service.EasyDatatablesListService;
import org.springframework.data.jpa.datatables.easy.service.EasyDatatablesListServiceImpl;
import org.springframework.data.jpa.datatables.easy.web.EasyDatatablesListController;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("/employee")
public class EmployeeController extends EasyDatatablesListController<Employee> {

	private final EmployeeDataTableRepository employeeDataTableRepository;
	private final EasyDatatablesListServiceImpl<Employee> employeeEasyDatatablesListService;

	public EmployeeController(EmployeeDataTableRepository employeeDataTableRepository, EasyDatatablesListServiceImpl<Employee> employeeEasyDatatablesListService) {
		this.employeeDataTableRepository = employeeDataTableRepository;
		this.employeeEasyDatatablesListService = employeeEasyDatatablesListService;
	}

	@RequestMapping("/list")
	public String list(Model model, WebRequest webRequest) {
		preInitModel(model);
		return super.list(model, webRequest);
	}

	@Override
	protected String getListCode() {
		return "employee";
	}

	@Override
	protected DataTablesRepository<Employee, Long> getDataTableRepository() {
		return this.employeeDataTableRepository;
	}

	@Override
	protected EasyDatatablesListService<Employee> getEasyDatatablesListService() {
		return this.employeeEasyDatatablesListService;
	}

	private void preInitModel(Model model) {
		model.addAttribute("positionEnums", Arrays.asList(Position.values()));
	}
}
