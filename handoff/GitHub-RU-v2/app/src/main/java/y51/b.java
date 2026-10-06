package y51;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public class b {
    public String a;
    public c b;

    public b(Set set, c cVar) {
        this.a = b(set);
        this.b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.a);
            sb.append('/');
            sb.append(aVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        String str = this.a;
        c cVar = this.b;
        synchronized (((HashSet) cVar.s)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.s);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) cVar.s)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.s);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
