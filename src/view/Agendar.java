/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import entity.Data;
import entity.Periodo;
import service.ServicoFaixada;

/**
 *
 * @author Wendler
 */
public class Agendar extends javax.swing.JFrame {

	private String especialidadeEscolhida;

	// public final String dataAgendada;
	//
	public Agendar(String especialidadeEscolhida) {
		this.setEspecialidadeEscolhida(especialidadeEscolhida);

		// jLabelTerapiaSelecionada.setText("Terapia Selecionada:
		// "+especialidadeEscolhida);

		initComponents();
	}

	public String getEspecialidadeEscolhida() {
		return especialidadeEscolhida;
	}

	public void setEspecialidadeEscolhida(String especialidadeEscolhida) {
		this.especialidadeEscolhida = especialidadeEscolhida;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jComboBox1 = new javax.swing.JComboBox();
		jLabelSelecioneOPeriodo = new javax.swing.JLabel();
		jButtonCancelarAlteraFuncionario = new javax.swing.JButton();
		jButtonConfirmaAlteraFuncionario = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

		ServicoFaixada servicoFachada = new ServicoFaixada();
		// String teste =
		// jComboBoxAgendaEspecialidadeFuncionario.getSelectedItem().toString();
		// String[] arrayTeste = teste.split(" - ");
		String[] arrayEspecialidadeEscolhida = getEspecialidadeEscolhida().split(" - ");
		
		entity.Funcionario funcionario = servicoFachada.solicitarFuncionarioByCrf(arrayEspecialidadeEscolhida[2]);
		for (Periodo itemPeriodo : servicoFachada.IniciarAgendamento(funcionario).getPeriodos()) {
			jComboBox1.addItem(itemPeriodo.getInicio().getHora() + "h �s " + itemPeriodo.getFim().getHora() + "h");
		}

		// jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[]
		// { "Item 1", "Item 2", "Item 3", "Item 4" }));

		jLabelSelecioneOPeriodo.setText("Selecione o periodo");
		jLabelSelecioneOPeriodo.setFont(new java.awt.Font("Tahoma", 0, 18));

		jButtonCancelarAlteraFuncionario.setText("Confirmar");
		jButtonCancelarAlteraFuncionario.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCancelarAlteraFuncionarioActionPerformed(evt);
			}
		});

		jButtonConfirmaAlteraFuncionario.setText("Agendar");
		jButtonConfirmaAlteraFuncionario.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonConfirmaAlteraFuncionarioActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
				layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addComponent(jButtonConfirmaAlteraFuncionario)
								.addPreferredGap(ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
								.addComponent(jButtonCancelarAlteraFuncionario).addGap(20))
						.addGroup(layout.createSequentialGroup().addGap(161).addComponent(jLabelSelecioneOPeriodo)
								.addContainerGap(183, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addGap(83)
								.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(92, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup().addContainerGap(156, Short.MAX_VALUE)
						.addComponent(jLabelSelecioneOPeriodo).addGap(18)
						.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(58)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jButtonConfirmaAlteraFuncionario)
								.addComponent(jButtonCancelarAlteraFuncionario))
						.addGap(19)));
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>

	private void jButtonCancelarAlteraFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {
		Paciente TelaPaciente = new Paciente("");
		TelaPaciente.setVisible(true);
		this.dispose();
	}

	private void jButtonConfirmaAlteraFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {
		ServicoFaixada servicoFachada = new ServicoFaixada();
		String[] arrayEspecialidadeEscolhida = getEspecialidadeEscolhida().split(" - ");
		
		String stringPeriodo = jComboBox1.getSelectedItem().toString();
		String periodo = stringPeriodo.replaceAll("h", " ");
		periodo = periodo.replaceAll(" �s ", "");
		String[] arrayPeriodo = periodo.split(" ");

		Data dt1 = Data.nova(Integer.parseInt(arrayPeriodo[0]), 0);
		Data dt2 = Data.nova(Integer.parseInt(arrayPeriodo[1]), 0);

		servicoFachada.AgregarAgendaPaciente(
				servicoFachada.Agendar(dt1, dt2,
						servicoFachada.solicitarFuncionarioByCrf(arrayEspecialidadeEscolhida[2])),
				servicoFachada.solicitarLoginPaciente("CPF"));
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		// java.awt.EventQueue.invokeLater(new Runnable() {
		// public void run() {
		// new Agendar("", "").setVisible(true);
		// }
		// });
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButtonCancelarAlteraFuncionario;
	private javax.swing.JButton jButtonConfirmaAlteraFuncionario;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabelSelecioneOPeriodo;
	// End of variables declaration
}