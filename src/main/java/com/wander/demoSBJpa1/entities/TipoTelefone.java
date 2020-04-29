package com.wander.demoSBJpa1.entities;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoTelefone implements Serializable {
	
		private static final long serialVersionUID = 1L;
		
		//region variables
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer tit_id;
		private String tit_descricao;
		private String tit_mascara;
		private Integer tit_ativo;

		
		public TipoTelefone() {}

		public TipoTelefone(Integer tit_id, String tit_descricao, String tit_mascara, Integer tit_ativo) {
			super();
			this.tit_id = tit_id;
			this.tit_descricao = tit_descricao;
			this.tit_mascara = tit_mascara;
			this.tit_ativo = tit_ativo;
		}

		//region Properties
		public Integer getTit_id() {
			return tit_id;
		}

		public void setTit_id(Integer tit_id) {
			this.tit_id = tit_id;
		}

		public String getTit_descricao() {
			return tit_descricao;
		}

		public void setTit_descricao(String tit_descricao) {
			this.tit_descricao = tit_descricao;
		}

		public String getTit_mascara() {
			return tit_mascara;
		}

		public void setTit_mascara(String tit_mascara) {
			this.tit_mascara = tit_mascara;
		}

		public Integer getTit_ativo() {
			return tit_ativo;
		}

		public void setTit_ativo(Integer tit_ativo) {
			this.tit_ativo = tit_ativo;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((tit_ativo == null) ? 0 : tit_ativo.hashCode());
			result = prime * result + ((tit_descricao == null) ? 0 : tit_descricao.hashCode());
			result = prime * result + ((tit_id == null) ? 0 : tit_id.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			TipoTelefone other = (TipoTelefone) obj;
			if (tit_ativo == null) {
				if (other.tit_ativo != null)
					return false;
			} else if (!tit_ativo.equals(other.tit_ativo))
				return false;
			if (tit_descricao == null) {
				if (other.tit_descricao != null)
					return false;
			} else if (!tit_descricao.equals(other.tit_descricao))
				return false;
			if (tit_id == null) {
				if (other.tit_id != null)
					return false;
			} else if (!tit_id.equals(other.tit_id))
				return false;
			return true;
		}
		
		
		
		
}
