package common;

import com.typesafe.config.Config;

public class CoreConstant {

    private static Config conf;

    static {
        conf = Configs.newBuilder()
                .withResource("automation.conf")
                .withResource("automation." + Env.get().getName() + ".conf")
                .build();
    }
}
