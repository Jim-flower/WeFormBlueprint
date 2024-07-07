package org.cores.Materiekern.Controller.HomePageController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.we.form.blueprint.tools.utils.Result;

/**
 * 主页获取应用列表等功能放在这里
 */
@RestController
@RequestMapping("/homepage")
public class HomePageController {
//
    @GetMapping("/getAppdock")
    public Result getAppdock() {

        return Result.ok();
    }
}
