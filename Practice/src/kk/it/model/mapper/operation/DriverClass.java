package kk.it.model.mapper.operation;

//import org.modelmapper.ModelMapper;

import java.util.Optional;

public class DriverClass {
    public static void main(String[] args) {
        UserEntity userSource = new UserEntity(101, "kamlesh kumar", "rasoolpur", "kanpur", "It");

        UserDto userDto = new UserDto();

        //ModelMapper modelMapper = new ModelMapper();
       // modelMapper.map(userSource, userDto);

        System.out.println(userDto);

 /*String aemActualUrlContextContent="https://tatadigital-dev.adobecqms.net/tcp/api/channels.";

        String aemUrl="https://tatadigital-dev.adobecqms.net/tcp/api/channels.f1aeedb5-3ace-40b5-a856-ff980440bd59.content.welcome_message.json";
        String aemContent = aemUrl.substring(aemActualUrlContextContent.length(), aemUrl.lastIndexOf("."));
        String programId = aemContent.substring(0, aemContent.indexOf("."));
        System.out.println(programId);*/



        // reflection API example

    }

}
