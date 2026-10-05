package g81;

import i81.i;
import java.util.List;
import java.util.Map;
import k71.k;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import w61.a0;
import y41.t1;

/* loaded from: /home/user/work/p/classes5.dex */
public final /* synthetic */ class c implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ d s;

    public /* synthetic */ c(d dVar, int i) {
        this.r = i;
        this.s = dVar;
    }

    public final Object k(Object obj) {
        i81.a aVar = (i81.a) obj;
        switch (this.r) {
            case 0:
                k.g(aVar, "$this$buildSerialDescriptor");
                i81.a.a(aVar, "type", q1.b);
                StringBuilder sb = new StringBuilder("kotlinx.serialization.Sealed<");
                d dVar = this.s;
                sb.append(dVar.a.c());
                sb.append('>');
                c cVar = new c(dVar, 1);
                i81.a.a(aVar, "value", t1.n(sb.toString(), i.e, new SerialDescriptor[0], cVar));
                List list = dVar.b;
                k.g(list, "<set-?>");
                aVar.b = list;
                break;
            default:
                k.g(aVar, "$this$buildSerialDescriptor");
                for (Map.Entry entry : this.s.e.entrySet()) {
                    i81.a.a(aVar, (String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor());
                }
                break;
        }
        return a0.a;
    }
}
