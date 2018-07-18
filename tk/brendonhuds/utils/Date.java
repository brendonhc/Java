class Date {

    private int month;
    private int day;
    private int year;

    Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void displayDate() {
        if (isValid()) {
            System.out.printf("%d/%d/%d\n", day, month, year);
        }
        else {
            System.out.printf("DATA INVALIDA\n");
        }
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    private boolean isValid() {
        // Verifica o ano
        if (year > 0) {

            // Verifica o mês
            if (month > 0 && month <= 12) {

                // Fevereiro, 28 dias
                if (month == 2) {
                    if (day > 0 && day <= 28) {
                        return true;
                    }
                }

                // Meses com 31 dias
                else if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {
                    if (day >= 1 && day <= 31) {
                        return true;
                    }
                }

                // Demais meses com 30 dias
                else {
                    if (day >= 1 && day <= 30) {
                        return true;
                    }
                }
            }
        }
        // Se falhar qualquer verificação, invalid
        return false;
    }
}
