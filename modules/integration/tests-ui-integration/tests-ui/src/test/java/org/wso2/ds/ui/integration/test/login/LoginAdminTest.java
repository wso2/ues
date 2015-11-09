/*
*Copyright (c) 2015​, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*WSO2 Inc. licenses this file to you under the Apache License,
*Version 2.0 (the "License"); you may not use this file except
*in compliance with the License.
*You may obtain a copy of the License at
*
*http://www.apache.org/licenses/LICENSE-2.0
*
*Unless required by applicable law or agreed to in writing,
*software distributed under the License is distributed on an
*"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*KIND, either express or implied.  See the License for the
*specific language governing permissions and limitations
*under the License.
*/

package org.wso2.ds.ui.integration.test.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.wso2.ds.ui.integration.util.DSUIIntegrationTest;

public class LoginAdminTest extends DSUIIntegrationTest {

    @Test(groups = "wso2.ds.login", description = "verify login to admin console")
    public void testLoginAdminTestcaseDS() throws Exception {
        DSUIIntegrationTest.loginToAdminConsole(getDriver(), getBaseUrl(), getCurrentUsername(), getCurrentPassword());
    }

    @Test(groups = "wso2.ds.login", description = "verify logout from admin console", dependsOnMethods =
            "testLoginAdminTestcaseDS")
    public void testLogoutAdminTestcaseDS() throws Exception {
        DSUIIntegrationTest.logoutFromAdminConsole(getDriver(), getBaseUrl());
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        getDriver().quit();
    }

}