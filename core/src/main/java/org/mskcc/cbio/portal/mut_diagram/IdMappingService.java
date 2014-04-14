/** Copyright (c) 2012 Memorial Sloan-Kettering Cancer Center.
**
** This library is free software; you can redistribute it and/or modify it
** under the terms of the GNU Lesser General Public License as published
** by the Free Software Foundation; either version 2.1 of the License, or
** any later version.
**
** This library is distributed in the hope that it will be useful, but
** WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
** MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
** documentation provided hereunder is on an "as is" basis, and
** Memorial Sloan-Kettering Cancer Center 
** has no obligations to provide maintenance, support,
** updates, enhancements or modifications.  In no event shall
** Memorial Sloan-Kettering Cancer Center
** be liable to any party for direct, indirect, special,
** incidental or consequential damages, including lost profits, arising
** out of the use of this software and its documentation, even if
** Memorial Sloan-Kettering Cancer Center 
** has been advised of the possibility of such damage.  See
** the GNU Lesser General Public License for more details.
**
** You should have received a copy of the GNU Lesser General Public License
** along with this library; if not, write to the Free Software Foundation,
** Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
**/

package org.mskcc.cbio.portal.mut_diagram;

import java.util.List;

/**
 * Id mapping service.
 */
public interface IdMappingService {

    /**
     * Return a list of UniProt accessions for the specified HUGO gene symbol, or an empty list if no such accessions exist.
     *
     * @param hugoGeneSymbol HUGO gene symbol, must not be null
     * @return a list of UniProt accessions for the specified HUGO gene symbol, or an empty list if no such accessions exist
     */
    List<String> mapFromHugoToUniprotAccessions(String hugoGeneSymbol);
    
    /**
     * 
     * @param uniprotId
     * @return 
     */
    String mapFromUniprotIdToUniprotAccession(String uniprotId);
}
