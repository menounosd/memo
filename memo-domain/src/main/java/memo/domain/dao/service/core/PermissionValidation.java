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
package memo.domain.dao.service.core;

import java.util.List;

import org.springframework.stereotype.Component;

import mojo.dao.core.Validation;

import memo.domain.dao.model.core.Permission;

@Component
public class PermissionValidation extends Validation<Permission> {

	@Override
	protected void validate(Permission entity, List<String> errors) {
		if (checkNull(entity, errors, "Permission.null")) {
			return;
		}

		checkNull(entity.getActor(), errors, "Permission.actor.null");
		checkNull(entity.getResource(), errors, "Permission.resource.null");
	}
}