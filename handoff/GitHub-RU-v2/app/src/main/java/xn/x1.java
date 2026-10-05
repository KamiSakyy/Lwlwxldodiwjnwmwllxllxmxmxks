package xn;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x1 implements KSerializer {
    public static final x1 a = new x1();
    public static final SerialDescriptor b = kotlinx.serialization.json.b.Companion.serializer().getDescriptor();

    public final Object deserialize(Decoder decoder) {
        l81.i iVar = decoder instanceof l81.i ? (l81.i) decoder : null;
        if (iVar == null) {
            throw new SerializationException("ElicitationFieldValue can only be deserialized from a JSON format");
        }
        kotlinx.serialization.json.d k = iVar.k();
        if (k instanceof kotlinx.serialization.json.a) {
            kotlinx.serialization.json.a d = l81.j.d(k);
            ArrayList arrayList = new ArrayList(x61.n.F(d, 10));
            Iterator it = d.r.iterator();
            while (it.hasNext()) {
                arrayList.add(l81.j.f((kotlinx.serialization.json.b) it.next()).a());
            }
            return new u1(arrayList);
        }
        if (!(k instanceof kotlinx.serialization.json.d)) {
            return new v1(k.toString());
        }
        kotlinx.serialization.json.d dVar = k;
        Boolean b2 = l81.j.b(dVar);
        if (b2 != null) {
            return new r1(b2.booleanValue());
        }
        Integer c = l81.j.c(dVar);
        if (c != null) {
            return new s1(c.intValue());
        }
        Double u = t71.v.u(dVar.a());
        return u != null ? new t1(u.doubleValue()) : new v1(dVar.a());
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Iterable, java.lang.Object] */
    public final void serialize(Encoder encoder, Object obj) {
        JsonNull aVar;
        JsonNull oVar;
        w1 w1Var = (w1) obj;
        k71.k.g(w1Var, "value");
        m81.r rVar = encoder instanceof m81.r ? (m81.r) encoder : null;
        if (rVar == null) {
            throw new SerializationException("ElicitationFieldValue can only be serialized with a JSON format");
        }
        if (w1Var instanceof v1) {
            String str = ((v1) w1Var).a;
            k81.g0 g0Var = l81.j.a;
            if (str == null) {
                aVar = JsonNull.INSTANCE;
            } else {
                oVar = new l81.o(str, true);
                aVar = oVar;
            }
        } else {
            if (w1Var instanceof r1) {
                Boolean valueOf = Boolean.valueOf(((r1) w1Var).a);
                k81.g0 g0Var2 = l81.j.a;
                oVar = new l81.o(valueOf, false);
            } else if (w1Var instanceof t1) {
                Double valueOf2 = Double.valueOf(((t1) w1Var).a);
                k81.g0 g0Var3 = l81.j.a;
                oVar = new l81.o(valueOf2, false);
            } else if (w1Var instanceof s1) {
                Integer valueOf3 = Integer.valueOf(((s1) w1Var).a);
                k81.g0 g0Var4 = l81.j.a;
                oVar = new l81.o(valueOf3, false);
            } else {
                if (!(w1Var instanceof u1)) {
                    throw new NoWhenBranchMatchedException();
                }
                java.lang.Object r6 = (java.lang.Object) (((u1) w1Var).a);
                ArrayList arrayList = new ArrayList(x61.n.F((Iterable) r6, 10));
                for (String str2 : r6) {
                    k81.g0 g0Var5 = l81.j.a;
                    arrayList.add(str2 == null ? JsonNull.INSTANCE : new l81.o(str2, true));
                }
                aVar = new kotlinx.serialization.json.a(arrayList);
            }
            aVar = oVar;
        }
        k71.k.g(aVar, "element");
        if (rVar.h == null || (aVar instanceof kotlinx.serialization.json.c)) {
            rVar.n(l81.k.a, aVar);
            return;
        }
        StringBuilder v = jo.f4.v("Class with serial name ", rVar.i, " cannot be serialized polymorphically because it is represented as ");
        v.append(k71.x.a(aVar.getClass()).c());
        v.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new JsonEncodingException(v.toString());
    }
}
