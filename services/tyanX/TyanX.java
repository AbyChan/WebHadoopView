package tyanX;



import data.Json;
import data.JsonArray;



public class TyanX {

	
	public String setDiv(){
		Json j1=new Json();
		j1.put("id", "123");
		Json j2=new Json();
		j2.put("id", "1234");
		JsonArray ja1=new JsonArray();
		ja1.put(j1);
		ja1.put(j2);

		Json j3=new Json();
		j3.put("c", ja1);		
		return j3.toString();

	}
	
	public String createWidget() {
		String json = "{tyanmassage:[ {action: {task:'createWidget',position:{x:'0',y:'35',horiz:'0',vert:'0' },id:'firstwindow',checknum:'123456',father:'eyeDesk',cent:'2',widgetname:'Window',params:{title:'Home'}}}]}";
		String fuck ="{tyanmassage :[{action:'fuck'}]}";
		String data="{root: [ {name:'1',value:'0'}, {name:'6101',value:'������'}, {name:'6102',value:'�����'}, {name:'6103',value:'�Ϻ���'}, {name:'6104',value:'������'}, {name:'6105',value:'μ����'}, {name:'6106',value:'�Ӱ���'}, {name:'6107',value:'������'}, {name:'6108',value:'������'}, {name:'6109',value:'������'}, {name:'6110',value:'������'} ]}"; 
		return json;

		
	}
	
	
	public void setMessageBox(){



		
		
	}
	
	public void messageBox(){
		
	}
	
	public void removeLayer(){
		
	}
	
	public void showLayer(){
		
	}
	
	public void hideLayer(){
		
	}
	
	public void isLayer(){
		
	}
	
	public void createjson(){
		
	}
	
}
