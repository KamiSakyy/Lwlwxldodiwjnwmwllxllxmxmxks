package p41;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import jo.f4;
import m7.y;
import z70.y1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements b {
    public static final e h = new e(0);
    public HashMap a;
    public HashMap b;
    public HashMap c;
    public HashSet d;
    public j e;
    public AtomicReference f;
    public y1 g;

    public f(ArrayList arrayList, ArrayList arrayList2, y1 y1Var) {
        q41.k kVar = q41.k.r;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        j jVar = new j();
        this.e = jVar;
        this.g = y1Var;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(a.c(jVar, j.class, m51.c.class, m51.b.class));
        int i = 0;
        arrayList3.add(a.c(this, f.class, new Class[0]));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            a aVar = (a) obj;
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((p51.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.g.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException unused) {
                    it.remove();
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).b.toArray();
                int length = array.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        Object obj3 = array[i4];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.d.add(obj3.toString());
                        }
                        i4++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                y.E(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.a.keySet());
                arrayList6.addAll(arrayList3);
                y.E(arrayList6);
            }
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj4 = arrayList3.get(i5);
                i5++;
                a aVar2 = (a) obj4;
                this.a.put(aVar2, new k(new k41.c(2, this, aVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj5 = arrayList5.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f.get();
        if (bool != null) {
            h(this.a, bool.booleanValue());
        }
    }

    @Override // p41.b
    public final synchronized p51.b c(o oVar) {
        l lVar = (l) this.c.get(oVar);
        if (lVar != null) {
            return lVar;
        }
        return h;
    }

    @Override // p41.b
    public final synchronized p51.b d(o oVar) {
        m71.a.n(oVar, "Null interface requested.");
        return (p51.b) this.b.get(oVar);
    }

    @Override // p41.b
    public final m f(o oVar) {
        p51.b d = d(oVar);
        return d == null ? new m(m.c, m.d) : d instanceof m ? (m) d : new m(null, d);
    }

    public final void h(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            a aVar = (a) entry.getKey();
            p51.b bVar = (p51.b) entry.getValue();
            int i = aVar.d;
            if (i == 1 || (i == 2 && z)) {
                bVar.get();
            }
        }
        j jVar = this.e;
        synchronized (jVar) {
            try {
                arrayDeque = jVar.b;
                if (arrayDeque != null) {
                    jVar.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw f4.g(it);
            }
        }
    }

    public final void i() {
        HashMap hashMap = this.b;
        HashMap hashMap2 = this.c;
        for (a aVar : this.a.keySet()) {
            for (i iVar : aVar.c) {
                boolean z = iVar.b == 2;
                o oVar = iVar.a;
                if (z && !hashMap2.containsKey(oVar)) {
                    Set set = Collections.EMPTY_SET;
                    l lVar = new l();
                    lVar.b = null;
                    lVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    lVar.a.addAll(set);
                    hashMap2.put(oVar, lVar);
                } else if (hashMap.containsKey(oVar)) {
                    continue;
                } else {
                    int i = iVar.b;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + aVar + ": " + oVar);
                    }
                    if (i != 2) {
                        hashMap.put(oVar, new m(m.c, m.d));
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a aVar = (a) obj;
            if (aVar.e == 0) {
                p51.b bVar = (p51.b) this.a.get(aVar);
                for (o oVar : aVar.b) {
                    HashMap hashMap = this.b;
                    if (hashMap.containsKey(oVar)) {
                        arrayList2.add(new b9.f(10, (m) ((p51.b) hashMap.get(oVar)), bVar));
                    } else {
                        hashMap.put(oVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap hashMap = this.c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.e != 0) {
                p51.b bVar = (p51.b) entry.getValue();
                for (o oVar : aVar.b) {
                    if (!hashMap2.containsKey(oVar)) {
                        hashMap2.put(oVar, new HashSet());
                    }
                    ((Set) hashMap2.get(oVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                l lVar = (l) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new b9.f(11, lVar, (p51.b) it.next()));
                }
            } else {
                o oVar2 = (o) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                l lVar2 = new l();
                lVar2.b = null;
                lVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                lVar2.a.addAll(set);
                hashMap.put(oVar2, lVar2);
            }
        }
        return arrayList;
    }
}
