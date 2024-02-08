package weekly2;

public enum MenuOption {
    ADD_BUSINESS_CONTACT(1),
    ADD_PERSONAL_CONTACT(2),
    DISPLAY_CONTACT(3),
    SEARCH_CONTACT(4),
    EXIT(5);

    private final int value;

    MenuOption(int value) {
        this.value=value;
    }


    public static MenuOption getValue(int input){
        for(MenuOption option:MenuOption.values()){
            if(option.value==input){
                return option;
            }
        }
        throw new IllegalArgumentException("유효하지 않은 메뉴 옵션입니다");
    }
}
