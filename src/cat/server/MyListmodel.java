package cat.server;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.DefaultListModel;
import cat.function.CatClientBean;

class MyListmodel extends DefaultListModel{
    //使用Vector来保证线程安全
	private Vector<CatClientBean>  clientBeans =null;
	
	public MyListmodel getModle() {
		return this;
	}

	//对用户对象进行遍历
	@Override
    public Enumeration elements() {
		return super.elements();
	}

	//我的用户列表
	public MyListmodel(HashMap<String, CatClientBean> onlines) {
		clientBeans =new Vector<>();
		clientBeans = (Vector<CatClientBean>)onlines.values();
	}

	//添加元素
	@Override
	public void addElement(Object element) {
		clientBeans.add((CatClientBean) element);
	}

	//删除元素
	@Override
	public boolean removeElement(Object obj) {
		return 	clientBeans.remove(obj);
	}

	//清除所有元素
	@Override
	public void clear() {
		clientBeans.removeAllElements();
	}

}
