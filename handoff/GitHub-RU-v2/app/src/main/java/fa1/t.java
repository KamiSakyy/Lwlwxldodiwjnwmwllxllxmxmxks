package fa1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/user/work/p/classes5.dex */
public final class t {
    public Class a;
    public Object b;
    public Method c;
    public List d;

    public t(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.a = cls;
        this.b = obj;
        this.c = method;
        this.d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.a.getName(), this.c.getName(), this.d);
    }
}
