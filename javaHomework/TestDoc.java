class TestDoc{
   public static void main(String[] args) {
        Doctor doc = new Doctor();
        FamilyDoctor famDoc = new FamilyDoctor();
        Doctor surgDoc = new Surgeon();
        System.out.println(doc.worksAtHospital+" "+famDoc.workAtHospital+" "+surgDoc.worksAtHospital);   
        famDoc.worksAtHospital=true;
        System.out.println(doc.worksAtHospital+" "+famDoc.workAtHospital+" "+surgDoc.worksAtHospital);   
        surgDoc.treatPatient();        

    } 
}