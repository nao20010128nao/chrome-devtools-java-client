package com.github.kklisura.cdtp.protocol.commands;

import com.github.kklisura.cdtp.protocol.annotations.Experimental;
import com.github.kklisura.cdtp.protocol.types.memory.DOMCounters;
import com.github.kklisura.cdtp.protocol.types.memory.PressureLevel;

@Experimental
public interface Memory {

	DOMCounters getDOMCounters();

	void prepareForLeakDetection();

	/**
	 * Enable/disable suppressing memory pressure notifications in all processes.
	 */
	void setPressureNotificationsSuppressed(Boolean suppressed);

	/**
	 * Simulate a memory pressure notification in all processes.
	 */
	void simulatePressureNotification(PressureLevel level);
}