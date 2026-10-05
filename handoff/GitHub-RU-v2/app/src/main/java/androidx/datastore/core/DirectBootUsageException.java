package androidx.datastore.core;

import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: /home/user/work/p/classes.dex */
public final class DirectBootUsageException extends IOException {

    /* renamed from: r, reason: collision with root package name */
    public final String f2249r;

    public DirectBootUsageException(FileNotFoundException fileNotFoundException) {
        super(fileNotFoundException);
        this.f2249r = "Encountered a [" + fileNotFoundException.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f2249r;
    }
}
