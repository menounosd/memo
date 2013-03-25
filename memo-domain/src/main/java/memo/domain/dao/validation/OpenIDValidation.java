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
package memo.domain.dao.validation;

import java.util.List;

import mojo.dao.core.Validation;

import memo.domain.dao.model.user.OpenID;

public class OpenIDValidation extends Validation<OpenID> {

	@Override
	protected void validate(OpenID entity, List<String> errors) {
		if (checkNull(entity, errors, "OpenID.null")) {
			return;
		}

		checkNull(entity.getUser(), errors, "OpenID.user.null");
		checkEmpty(entity.getAddress(), errors, "OpenID.address.empty");
	}
}
