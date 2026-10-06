package ta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x01.i;
import x61.n;

/* loaded from: /home/user/work/p/classes.dex */
public class e {
    public static final ArrayList a(List list, String str, i iVar) {
        ArrayList arrayList = new ArrayList(n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mn.a aVar = (mn.a) it.next();
            arrayList.add(new b(aVar.b, str, iVar, aVar));
        }
        return arrayList;
    }
}
