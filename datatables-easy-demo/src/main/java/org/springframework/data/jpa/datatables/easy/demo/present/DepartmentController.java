package org.springframework.data.jpa.datatables.easy.demo.present;

import org.springframework.data.jpa.datatables.easy.demo.persistence.entities.Department;
import org.springframework.data.jpa.datatables.easy.demo.persistence.repository.DepartmentDataTableRepository;
import org.springframework.data.jpa.datatables.easy.service.EasyDatatablesListService;
import org.springframework.data.jpa.datatables.easy.service.EasyDatatablesListServiceImpl;
import org.springframework.data.jpa.datatables.easy.web.EasyDatatablesListController;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("/department")
public class DepartmentController extends EasyDatatablesListController<Department> {

    private final DepartmentDataTableRepository departmentDataTableRepository;
    private final EasyDatatablesListServiceImpl<Department> departmentEasyDatatablesListService;

    public DepartmentController(DepartmentDataTableRepository departmentDataTableRepository, EasyDatatablesListServiceImpl<Department> departmentEasyDatatablesListService) {
        this.departmentDataTableRepository = departmentDataTableRepository;
        this.departmentEasyDatatablesListService = departmentEasyDatatablesListService;
    }

    @RequestMapping("/list")
    public String list(Model model, WebRequest webRequest) {
        return super.list(model, webRequest);
    }

    @Override
    protected String getListCode() {
        return "department";
    }

    @Override
    protected DataTablesRepository<Department, Long> getDataTableRepository() {
        return this.departmentDataTableRepository;
    }

    @Override
    protected EasyDatatablesListService<Department> getEasyDatatablesListService() {
        return this.departmentEasyDatatablesListService;
    }
}
