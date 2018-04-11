package app;

import java.util.*;

public class App {

	private List<Project> projects = new ArrayList<Project>();
	private List<Worker> workers = new ArrayList<Worker>();
	private List<Date> dates = new ArrayList<Date>();
	
	public void List<Project> getProjects(){
		return projects;
	}
	
	public void List<Worker> getWorkers(){
		return workers;
	}
	
	public void List<Dates> getDates(){
		return dates;
	}
	
	public void createProject() {
		//Unfinished
	}
	
	public void removeProject(int projectID) {
		//Unfinished
	}
	
	public List<Worker> findAvailableWorkers(Project project, Activity activity) {
		//Unfinished
	}
	
	public void createWorker(String initials){
		//Unfinished
	}
	
	public Project findProject(String projectID) {
		//Unfinished
	}
	
	public List<Worker> assignedWorkers(Project project, Activity activity) {
		//Unfinished
	}
	
	public void assign(Worker worker, Project project, Activity activity) {
		//Unfinished
	}
	
	public List<Activity> listActivities(Project project){
		//Unfinished
	}
	
	public void removeFromActivity(Worker worker, Project project, Activity activity){
		//Unfinished
	}
	
	public void addActivity(Project project, String name) {
		//Unfinished
	}
	
	public void renameActivity(Project project, Activity activity, String newName) {
		//Unfinished
	}
	
	public void registerTime(Date date, Worker worker, Double hours, Project project, Activity activity) {
		//Unfinished
	}
}
