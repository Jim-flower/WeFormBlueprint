package org.cores.Materiekern.Controller.KechainController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.we.form.blueprint.tools.utils.Result;

@RestController
@RequestMapping("/keyChain")
public class MyKeyChainController {
    @GetMapping("/dial")
    @ResponseBody
    public Result dial(){

        return Result.ok();
    }
}
