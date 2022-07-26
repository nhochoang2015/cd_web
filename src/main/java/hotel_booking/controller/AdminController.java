package hotel_booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/management")
	public String homePage(Model model) {
		return "../admin_page/account-management";
	}
	@GetMapping("/edit")
	public String editPage(Model model) {
		return "../admin_page/editAccount";
	}
	@GetMapping("/analytics")
	public String analyticsPage(Model model) {
		return "../admin_page/analytics";
	}

	@GetMapping("/bar-charts")
	public String barChartsPage(Model model) {
		return "../admin_page/bar-charts";
	}

	@GetMapping("/date-table")
	public String dataTablePage(Model model) {
		return "../admin_page/date-table";
	}

	@GetMapping("/google-map")
	public String googleMapPage(Model model) {
		return "../admin_page/google-map";
	}

	@GetMapping("/images-cropper")
	public String imagesCropperPage(Model model) {
		return "../admin_page/images-cropper";
	}

	@GetMapping("/line-charts")
	public String lineChartsPage(Model model) {
		return "../admin_page/line-charts";
	}

	@GetMapping("/product-edit")
	public String productEditPage(Model model) {
		return "../admin_page/product-edit";
	}

	@GetMapping("/AccountMng")
	public String productListPage(Model model) {
		return "../admin_page/AccountMng";
	}

	@GetMapping("/product-payment")
	public String productPaymentPage(Model model) {
		return "../admin_page/product-payment";
	}

	@GetMapping("/rounded-chart")
	public String roundedChartPage(Model model) {
		return "../admin_page/rounded-chart";
	}
}
