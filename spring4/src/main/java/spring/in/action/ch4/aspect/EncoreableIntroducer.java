package spring.in.action.ch4.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "spring.in.action.ch4.aspect.Performance+",
            defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}