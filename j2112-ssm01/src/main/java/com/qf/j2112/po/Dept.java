package com.qf.j2112.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PACKAGE_NAME: com.qf.j2112.po
 * @NAME: Dept
 * @USER: ☆森☆
 * @CreateTime: 2022-02-18  17:45
 * @PROJECT_NAME: j2112-ssm01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    private int deptno;
    private String dname;
    private String loc;
}
