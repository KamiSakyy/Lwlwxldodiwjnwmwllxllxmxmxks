package k81;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d extends s {
    public final /* synthetic */ int b;
    public final o0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(KSerializer kSerializer, int i) {
        super(kSerializer);
        this.b = i;
        switch (i) {
            case 1:
                k71.k.g(kSerializer, "eSerializer");
                super(kSerializer);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                k71.k.g(descriptor, "elementDesc");
                this.c = new c(descriptor, 2);
                break;
            case 2:
                k71.k.g(kSerializer, "eSerializer");
                super(kSerializer);
                SerialDescriptor descriptor2 = kSerializer.getDescriptor();
                k71.k.g(descriptor2, "elementDesc");
                this.c = new c(descriptor2, 3);
                break;
            default:
                k71.k.g(kSerializer, "element");
                SerialDescriptor descriptor3 = kSerializer.getDescriptor();
                k71.k.g(descriptor3, "elementDesc");
                this.c = new c(descriptor3, 1);
                break;
        }
    }

    @Override // k81.a
    public final Object a() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // k81.a
    public final int b(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k71.k.g(arrayList, "<this>");
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                k71.k.g(hashSet, "<this>");
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                k71.k.g(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // k81.a
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        k71.k.g(collection, "<this>");
        return collection.iterator();
    }

    @Override // k81.a
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        k71.k.g(collection, "<this>");
        return collection.size();
    }

    @Override // k81.a
    public final Object g(Object obj) {
        switch (this.b) {
            case 0:
                k71.k.g((Object) null, "<this>");
                return new ArrayList((Collection) null);
            case 1:
                k71.k.g((Object) null, "<this>");
                return new HashSet((Collection) null);
            default:
                k71.k.g((Object) null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.b) {
        }
        return (c) this.c;
    }

    @Override // k81.a
    public final Object h(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k71.k.g(arrayList, "<this>");
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                k71.k.g(hashSet, "<this>");
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                k71.k.g(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // k81.s
    public final void i(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k71.k.g(arrayList, "<this>");
                arrayList.add(i, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                k71.k.g(hashSet, "<this>");
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                k71.k.g(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                break;
        }
    }
}
