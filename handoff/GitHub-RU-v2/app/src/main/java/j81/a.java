package j81;

import b21.l;
import k81.g1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: /home/user/work/p/classes5.dex */
public interface a {
    Object A(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    l a();

    long f(SerialDescriptor serialDescriptor, int i);

    void g(SerialDescriptor serialDescriptor);

    float h(g1 g1Var, int i);

    char i(g1 g1Var, int i);

    short j(g1 g1Var, int i);

    int m(SerialDescriptor serialDescriptor, int i);

    boolean p(SerialDescriptor serialDescriptor, int i);

    Decoder q(g1 g1Var, int i);

    String r(SerialDescriptor serialDescriptor, int i);

    int t(SerialDescriptor serialDescriptor);

    byte v(g1 g1Var, int i);

    Object x(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    double z(SerialDescriptor serialDescriptor, int i);
    public Object s = null;
}
