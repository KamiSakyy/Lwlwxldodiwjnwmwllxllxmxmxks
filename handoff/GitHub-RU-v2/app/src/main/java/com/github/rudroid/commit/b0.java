package com.github.rudroid.commit;

import k81.i1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import y41.t1;

/* loaded from: /home/user/work/p/classes.dex */
public final class b0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f9070a = new b0();

    /* renamed from: b, reason: collision with root package name */
    public static final i1 f9071b = t1.b("CommitOid");

    public final Object deserialize(Decoder decoder) {
        String n10 = decoder.n();
        k71.k.g(n10, "value");
        return new qb.a(n10);
    }

    public final SerialDescriptor getDescriptor() {
        return f9071b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        String str = ((qb.a) obj).f31028a;
        k71.k.g(str, "$v$c$com-github-android-common-datatypes-CommitOid$-value$0");
        encoder.p(str);
    }
}
