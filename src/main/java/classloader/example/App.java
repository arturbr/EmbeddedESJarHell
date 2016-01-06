package classloader.example;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.node.Node;
import org.elasticsearch.node.NodeBuilder;

public class App {

    public static void startElasticsearch() {

    	NodeBuilder nodeBuilder = NodeBuilder.nodeBuilder();
    	Settings.Builder builder = Settings.builder();

    	builder.put("path.home", "pathhome");

		nodeBuilder.settings(builder);

		Node node = nodeBuilder.node();

		node.start();

    }
}
