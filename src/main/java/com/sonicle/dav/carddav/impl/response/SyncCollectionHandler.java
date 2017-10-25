/*
 * Copyright (C) 2017 Sonicle S.r.l.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License version 3 as published by
 * the Free Software Foundation with the addition of the following permission
 * added to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED
 * WORK IN WHICH THE COPYRIGHT IS OWNED BY SONICLE, SONICLE DISCLAIMS THE
 * WARRANTY OF NON INFRINGEMENT OF THIRD PARTY RIGHTS.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301 USA.
 *
 * You can contact Sonicle S.r.l. at email address sonicle[at]sonicle[dot]com
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License version 3.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License
 * version 3, these Appropriate Legal Notices must retain the display of the
 * Sonicle logo and Sonicle copyright notice. If the display of the logo is not
 * reasonably feasible for technical reasons, the Appropriate Legal Notices must
 * display the words "Copyright (C) 2017 Sonicle S.r.l.".
 */
package com.sonicle.dav.carddav.impl.response;

import com.sonicle.dav.DavSyncStatus;
import com.sonicle.dav.impl.DavException;
import com.sonicle.dav.impl.MultistatusHandler;
import com.sonicle.dav.impl.handler.MultistatusResponseHandler;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.ResponseHandler;
import zswi.schemas.carddav.objects.Multistatus;
import zswi.schemas.carddav.objects.ObjectFactory;
import zswi.schemas.carddav.objects.Prop;
import zswi.schemas.carddav.objects.Propstat;
import zswi.schemas.carddav.objects.Response;

/**
 *
 * @author malbinola
 */
public class SyncCollectionHandler extends MultistatusHandler<Multistatus, List<DavSyncStatus>> {
	
	@Override
	public ResponseHandler<Multistatus> getResponseHandler() {
		return new MultistatusResponseHandler<>(ObjectFactory.class);
	}

	@Override
	public List<DavSyncStatus> fromMultistatus(Multistatus multistatus) throws DavException {
		List<DavSyncStatus> result = new ArrayList<>(multistatus.getResponse().size());
		for (Response response : multistatus.getResponse()) {
			for (Propstat propstat : response.getPropstat()) {
				result.add(createDavSyncStatus(response, propstat));
			}
		}
		return result;
	}
	
	protected DavSyncStatus createDavSyncStatus(final Response response, final Propstat propstat) {
		final Prop prop = propstat.getProp();
		return new DavSyncStatus(
				response.getHref(),
				prop.getGetetag(),
				propstat.getStatus()
		);
	}
}
