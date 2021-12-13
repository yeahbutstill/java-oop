package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("admin", null);
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
