/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */

//$Id$
package org.hibernate.test.annotations.cid;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Emmanuel Bernard
 */
@Embeddable
public class TvMagazinPk implements Serializable {
	@ManyToOne
	@JoinColumn(nullable=false)
	public Channel channel;
	
	@ManyToOne
	@JoinColumn(nullable=false)
	public Presenter presenter;
}
