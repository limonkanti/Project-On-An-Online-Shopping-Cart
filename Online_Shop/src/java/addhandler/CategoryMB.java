
package addhandler;

import dao.AddDao;
import entity.Category;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class CategoryMB 
{
    Category category=new Category();

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    public String addCategory()
    {
        category.setCatName(category.getCatName());
        category.setCatDesc(category.getCatDesc());
        boolean status=new AddDao().addCategory(category);
        if(status)
        {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved Successfully",""));
            
        }
        else
        {
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sorry!!! Data have't Saved Successfully",""));
            
        }
        return null;
    }
    
}
