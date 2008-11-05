package org.jboss.resteasy.plugins.providers.atom;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.URI;

/**
 * <p>Per RFC4287:</p>
 * <p/>
 * <pre>
 *  The "atom:category" element conveys information about a category
 *  associated with an entry or feed.  This specification assigns no
 *  meaning to the content (if any) of this element.
 * <p/>
 *  atomCategory =
 *     element atom:category {
 *        atomCommonAttributes,
 *        attribute term { text },
 *        attribute scheme { atomUri }?,
 *        attribute label { text }?,
 *        undefinedContent
 *     }
 * </pre>
 *
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
@XmlRootElement(name = "category")
public class Category extends CommonAttributes
{
   @XmlAttribute
   private String term;

   @XmlAttribute
   private URI scheme;

   @XmlAttribute
   private String label;

   public String getTerm()
   {
      return term;
   }

   public void setTerm(String term)
   {
      this.term = term;
   }

   public URI getScheme()
   {
      return scheme;
   }

   public void setScheme(URI scheme)
   {
      this.scheme = scheme;
   }

   public String getLabel()
   {
      return label;
   }

   public void setLabel(String label)
   {
      this.label = label;
   }
}
