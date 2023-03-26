public class Education extends  Government {
    private String study;
    private String sphereOfinFluence;

    public Education(String study, String sphereOfinFluence) {
        this.study = study;
        this.sphereOfinFluence = sphereOfinFluence;
    }

    @Override
    public void print() {
        System.out.println("Министерство образование, тип работы: " + study +
                "\nСфера влияния: " + sphereOfinFluence);

    }
}
