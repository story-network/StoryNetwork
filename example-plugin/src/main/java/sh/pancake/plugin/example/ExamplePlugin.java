package sh.pancake.plugin.example;

import sh.pancake.server.plugin.IPancakePlugin;
import sh.pancake.server.plugin.PluginData;

public class ExamplePlugin implements IPancakePlugin {

    private PluginData data;

    @Override
    public void init(PluginData data) {
        this.data = data;
        
        System.out.println("Hello world!");
    }

    @Override
    public void onLoad() {
        
    }

    @Override
    public void onUnload() {
        
    }

}
