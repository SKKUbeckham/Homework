class TestDoc{
   public static void main(String[] args) {
        Doctor doc = new Doctor();
        FamilyDoctor famDoc = new FamilyDoctor();
        Surgeon surgDoc = new Doctor();
        System.out.println(doc.worksAtHospital+" "+famDoc.workAtHospital+" "+surgDoc.worksAtHospital);   
        famDoc.worksAtHospital=true;
        System.out.println(doc.worksAtHospital+" "+famDoc.workAtHospital+" "+surgDoc.worksAtHospital);   
        surgDoc.treatPatient();        

    } 
}