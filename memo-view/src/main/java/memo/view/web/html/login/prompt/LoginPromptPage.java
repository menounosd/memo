/*
 * Copyright (C) 2010 Dimitrios Menounos
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package memo.view.web.html.login.prompt;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import mojo.web.component.UIComponent;
import mojo.web.util.SpringUtils;

import memo.view.web.html.base.BaseTemplate;

@Component
@Scope("prototype")
public class LoginPromptPage extends BaseTemplate {

	private UIComponent basicLoginPrompt;
	private UIComponent openIDLoginPrompt;

	public LoginPromptPage() {
		setTitle("Login or Register");

		basicLoginPrompt = SpringUtils.getComponent(BasicLoginPrompt.class);
		add(basicLoginPrompt);

		openIDLoginPrompt = SpringUtils.getComponent(OpenIDLoginPrompt.class);
		add(openIDLoginPrompt);
	}
}
