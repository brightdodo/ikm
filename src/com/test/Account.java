package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.math.BigDecimal;
import java.util.Optional;
import java.util.Random;

interface Account {
    BigDecimal balance = new BigDecimal(0.00);
    class SavingsAccount implements Account {
        public SavingsAccount(BigDecimal init) {
//           balance = init;
        }
        public String toString() {
            return "";
        }
    }
}
