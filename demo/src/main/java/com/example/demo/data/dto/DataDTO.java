package com.example.demo.data.dto;

import lombok.Data;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
public class DataDTO {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private int c_YeonBeon;
        private String c_SiDo;
        private String c_SiKunKu;
        private String c_EubMyeonDong;
        private String c_DongRi;
        private double c_KyeongDo;
        private double c_WiDo;
        private String c_KuYeokKuBun;
        private String c_JangSo;

        public DataDTO (Long id, int c_YeonBeon, String c_SiDo, String c_SiKunKu, String c_EubMyeonDong, String c_DongRi, double c_KyeongDo, double c_WiDo, String c_KuYeokKuBun, String c_JangSo) {
            this.id = id;
            this.c_YeonBeon = c_YeonBeon;
            this.c_SiDo = c_SiDo;
            this.c_SiKunKu = c_SiKunKu;
            this.c_EubMyeonDong = c_EubMyeonDong;
            this.c_DongRi = c_DongRi;
            this.c_KyeongDo = c_KyeongDo;
            this.c_WiDo = c_WiDo;
            this.c_KuYeokKuBun = c_KuYeokKuBun;
            this.c_JangSo = c_JangSo;
        }

    }







