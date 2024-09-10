package hu.peterszrnka.sensitivelogging;

import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

public class CustomJacksonAnnotationIntrospector extends JacksonAnnotationIntrospector {

    @Override
    public Object findSerializer(Annotated am) {
        Sensitive annotation = am.getAnnotation(Sensitive.class);
        return (annotation != null) ? MaskSensitiveDataSerializer.class : super.findSerializer(am);
    }
}
