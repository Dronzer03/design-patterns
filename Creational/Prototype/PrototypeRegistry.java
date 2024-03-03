import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PrototypeRegistry {
    private Map<String, CarPrototype> registry = new HashMap<>();

    public void registerPrototype(String prototypeName, CarPrototype prototype) {
        registry.put(prototypeName, prototype);
    }

    public void unregisterPrototype(String prototypeName) {
        registry.remove(prototypeName);
    }

    public CarPrototype getPrototypeClone(String prototypeName) {
        CarPrototype prototype = registry.get(prototypeName);
        if (!Objects.isNull(prototype)) {
            return prototype.clone();
        }
        return null;
    }
}
