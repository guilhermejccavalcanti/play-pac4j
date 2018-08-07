/*
  Copyright 2012 - 2014 Jerome Leleu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.pac4j.play;

/**
 * This class gathers all the constants.
 * 
 * @author Jerome Leleu
 * @since 1.0.0
 */
public interface Constants {

    public static final String SESSION_ID = "pac4jSessionId";

    public static final String REDIRECT_URL_LOGOUT_PARAMETER_NAME = "url";

    public static final String CLIENT_NAME = "clientName";

    public static final String TARGET_URL = "targetUrl";

    public static final String IS_AJAX = "isAjax";

    public static final String REQUIRE_ANY_ROLE = "requireAnyRole";

    public static final String REQUIRE_ALL_ROLES = "requireAllRoles";

    public static final String SEPARATOR = "$";
}
