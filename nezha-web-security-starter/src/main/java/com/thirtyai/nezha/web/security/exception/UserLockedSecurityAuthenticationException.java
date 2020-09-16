/*
 * Copyright (c) 2019-2020 kyle ju(Email: nezha@thirtyai.com  QQ: 17062743) All rights reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.thirtyai.nezha.web.security.exception;

import com.thirtyai.nezha.i18n.Status;

public class UserLockedSecurityAuthenticationException extends I18nSecurityAuthenticationException {

	public UserLockedSecurityAuthenticationException() {
		super(Status.Security_Token_Type_Not_Found);
	}

	public UserLockedSecurityAuthenticationException(Throwable t) {
		super(Status.Security_Token_Type_Not_Found, t);
	}
}
