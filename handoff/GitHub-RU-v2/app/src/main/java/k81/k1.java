package k81;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public final class k1 extends s {
    public final r71.b b;
    public final c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(r71.b bVar, KSerializer kSerializer) {
        super(kSerializer);
        k71.k.g(kSerializer, "eSerializer");
        this.b = bVar;
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        k71.k.g(descriptor, "elementDesc");
        this.c = new c(descriptor, 0);
    }

    @Override // k81.a
    public final Object a() {
        return new ArrayList();
    }

    @Override // k81.a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        k71.k.g(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // k81.a
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        k71.k.g(objArr, "<this>");
        return k71.k.k(objArr);
    }

    @Override // k81.a
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        k71.k.g(objArr, "<this>");
        return objArr.length;
    }

    @Override // k81.a
    public final Object g(Object obj) {
        k71.k.g((Object) null, "<this>");
        x61.l.r((Object[]) null);
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    @Override // k81.a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        k71.k.g(arrayList, "<this>");
        r71.b bVar = this.b;
        k71.k.g(bVar, "eClass");
        Object newInstance = Array.newInstance((Class<?>) v8.l0.x(bVar), arrayList.size());
        k71.k.e(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        k71.k.f(array, "toArray(...)");
        return array;
    }

    @Override // k81.s
    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        k71.k.g(arrayList, "<this>");
        arrayList.add(i, obj2);
    }
}
