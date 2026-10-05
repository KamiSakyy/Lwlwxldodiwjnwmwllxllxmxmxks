package kotlinx.serialization.encoding;

import b21.l;
import com.google.android.gms.internal.measurement.d5;
import k71.k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public interface Encoder {
    l a();

    d5 b(SerialDescriptor serialDescriptor);

    void c();

    void d(double d);

    void e(short s);

    void f(byte b);

    void g(boolean z);

    void h(float f);

    void i(char c);

    default d5 j(SerialDescriptor serialDescriptor, int i) {
        k.g(serialDescriptor, "descriptor");
        return b(serialDescriptor);
    }

    void k(SerialDescriptor serialDescriptor, int i);

    void l(int i);

    Encoder m(SerialDescriptor serialDescriptor);

    default void n(KSerializer kSerializer, Object obj) {
        k.g(kSerializer, "serializer");
        kSerializer.serialize(this, obj);
    }

    void o(long j);

    void p(String str);
}
